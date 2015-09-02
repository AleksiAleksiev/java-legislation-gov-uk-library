package org.leibnizcenter.uk.legislation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * There are a multitude of XML elements that may appear in the table of contents, so we introduce this interface to
 * create a semantic group for them. For an example ToC, see <a href="http://www.legislation.gov.uk/ukpga/1998/29/contents/data.xml">http://www.legislation.gov.uk/ukpga/1998/29/contents/data.xml</a>.
 * <p>
 * Created by maarten on 2-9-15.
 */
public interface TableOfContentsElement {

    /**
     * @return List of child elements that can be seen as entities in a table of contents
     */
    List<TableOfContentsElement> getToCChildren();

    class Helper {
        public static List<TableOfContentsElement> castToTableOfContentsElement(List<Object> objList) {
            List<TableOfContentsElement> l = new ArrayList<>(objList.size());
            Collections.copy(objList, l);
            return l;
        }
    }
}
