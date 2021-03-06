package org.leibnizcenter.uk.legislation;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 * Create request to fetch UK law, for example http://www.legislation.gov.uk/all/data.feed?page=2
 * <p>
 * Created by Maarten on 24-1-2015.
 */
public class FeedRequestBuilder {
    private final Map<String, String> mQueryParams;
    private int mPage = 1;
    private String type = null;
    private String year = null;
    private int[] numberRange = null;

    public FeedRequestBuilder() {
        mQueryParams = new HashMap<>();
    }

    public FeedRequestBuilder setQueryParameter(String key, String value) {
        mQueryParams.put(key, value);
        return this;
    }

    public FeedRequestBuilder setYear(int year) {
        setYear(year + "");
        return this;
    }

    public FeedRequestBuilder setNumberRange(int start, int end) {
        numberRange = new int[]{start, end};
        return this;
    }

    public FeedRequestBuilder setYear(String year) {
        this.year = year;
        return this;
    }

//    public void setNumber(String number) {
//        this.number = number;
//    }

    public FeedRequestBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public FeedRequestBuilder setPage(int page) {
        mPage = page;
        return this;
    }

    public HttpUrl buildUrl() {
        HttpUrl.Builder builder = new HttpUrl.Builder()
                .scheme("http")
                .host("www.legislation.gov.uk");
        if (type != null) {
            builder.addPathSegment(type);
            if (year != null) {
                builder.addPathSegment(year);
                if (numberRange != null) {
                    builder.addPathSegment(numberRange[0] + "-" + numberRange[1]);
                }
            }
        } else {
            builder.addPathSegment("all");
        }

        for (String key : mQueryParams.keySet()) {
            builder.addQueryParameter(key, mQueryParams.get(key));
        }
        builder.addPathSegment("data.feed")
                .setQueryParameter("page", mPage + "");
        //System.out.println(mBuilder.build());
        return builder.build();
    }

    public Request build() {
        return new Request.Builder()
                .url(buildUrl())
                .build();
    }
}
