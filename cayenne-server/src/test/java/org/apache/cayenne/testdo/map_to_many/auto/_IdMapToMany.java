package org.apache.cayenne.testdo.map_to_many.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.map_to_many.IdMapToManyTarget;

import java.util.Map;

/**
 * Class _IdMapToMany was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IdMapToMany extends CayenneDataObject {

    public static final String TARGETS_PROPERTY = "targets";

    public static final String ID_PK_COLUMN = "ID";

    public void addToTargets(IdMapToManyTarget obj) {
        addToManyTarget(TARGETS_PROPERTY, obj, true);
    }
    public void removeFromTargets(IdMapToManyTarget obj) {
        removeToManyTarget(TARGETS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public Map<Object, IdMapToManyTarget> getTargets() {
        return (Map<Object, IdMapToManyTarget>)readProperty(TARGETS_PROPERTY);
    }


}