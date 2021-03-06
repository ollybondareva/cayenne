package org.apache.cayenne.testdo.map_to_many.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.map_to_many.MapToMany;

/**
 * Class _MapToManyTarget was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MapToManyTarget extends CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String MAP_TO_MANY_PROPERTY = "mapToMany";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setMapToMany(MapToMany mapToMany) {
        setToOneTarget(MAP_TO_MANY_PROPERTY, mapToMany, true);
    }

    public MapToMany getMapToMany() {
        return (MapToMany)readProperty(MAP_TO_MANY_PROPERTY);
    }


}
