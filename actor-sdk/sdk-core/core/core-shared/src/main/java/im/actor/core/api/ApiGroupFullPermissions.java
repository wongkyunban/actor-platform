package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import java.io.IOException;

public enum ApiGroupFullPermissions {

    EDIT_INFO(1),
    VIEW_MEMBERS(2),
    INVITE_MEMBERS(3),
    INVITE_VIA_LINK(4),
    CALL(5),
    EDIT_ADMIN_SETTINGS(6),
    VIEW_ADMINS(7),
    EDIT_ADMINS(8),
    UNSUPPORTED_VALUE(-1);

    private int value;

    ApiGroupFullPermissions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ApiGroupFullPermissions parse(int value) throws IOException {
        switch(value) {
            case 1: return ApiGroupFullPermissions.EDIT_INFO;
            case 2: return ApiGroupFullPermissions.VIEW_MEMBERS;
            case 3: return ApiGroupFullPermissions.INVITE_MEMBERS;
            case 4: return ApiGroupFullPermissions.INVITE_VIA_LINK;
            case 5: return ApiGroupFullPermissions.CALL;
            case 6: return ApiGroupFullPermissions.EDIT_ADMIN_SETTINGS;
            case 7: return ApiGroupFullPermissions.VIEW_ADMINS;
            case 8: return ApiGroupFullPermissions.EDIT_ADMINS;
            default: return ApiGroupFullPermissions.UNSUPPORTED_VALUE;
        }
    }
}
