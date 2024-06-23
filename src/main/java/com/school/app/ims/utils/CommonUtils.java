package com.school.app.ims.utils;

import com.google.common.hash.Hashing;

import static com.school.app.ims.constants.Constants.HASH_INDEX_PREFIX;
import static com.school.app.ims.constants.Constants.MAX_HASH_RANGE;

public class CommonUtils {

    public static String getHashIndex(Object object) {
        return HASH_INDEX_PREFIX + String.format("%06d", generateHashIndex(object));
    }

    private static int generateHashIndex(Object object) {
        return Hashing.consistentHash(object.hashCode(), MAX_HASH_RANGE);
    }

}
