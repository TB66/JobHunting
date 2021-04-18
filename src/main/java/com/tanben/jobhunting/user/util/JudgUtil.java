package com.tanben.jobhunting.user.util;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JudgUtil {


    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if (o instanceof String) {
            if (o.toString().trim().equals("") || o.toString().trim().equals("null")) {
                return true;
            }
        } else if (o instanceof List) {
            if (((List) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Map) {
            if (((Map) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Set) {
            if (((Set) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Object[]) {
            if (((Object[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof int[]) {
            if (((int[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof long[]) {
            if (((long[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof Integer) {
            if (o.toString().trim().equals("0")) {
                return true;
            }
        }
        return false;
    }

    /**
     * ���������Ƿ���� Empty Object
     *
     * @param os ������
     * @return
     */
    public static boolean isOneEmpty(Object... os) {
        for (Object o : os) {
            if (isEmpty(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * ���������Ƿ�ȫ�� Empty Object
     *
     * @param os
     * @return
     */
    public static boolean isAllEmpty(Object... os) {
        for (Object o : os) {
            if (!isEmpty(o)) {
                return false;
            }
        }
        return true;
    }

    /**
     * �Ƿ�Ϊ����
     *
     * @param obj
     * @return
     */
    public static boolean isNum(Object obj) {
        try {
            Integer.parseInt(obj.toString());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * �ַ����Ƿ�Ϊ true
     *
     * @param str
     * @return
     */
    public static boolean isTrue(Object str) {
        if (isEmpty(str)) {
            return false;
        }
        str = str.toString().trim().toLowerCase();
        if (str.equals("true") || str.equals("on")) {
            return true;
        }
        return false;
    }

    /**
     * ��ʽ���ַ���->'str'
     *
     * @param str
     * @return
     */
    public static String format(Object str) {
        return "'" + str.toString() + "'";
    }

    /**
     * ǿת->Integer
     *
     * @param obj
     * @return
     */
    public static Integer toInt(Object obj) {
        return Integer.parseInt(obj.toString());
    }

    /**
     * ǿת->Integer
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static Integer toInt(Object obj, int defaultValue) {
        if (isEmpty(obj)) {
            return defaultValue;
        }
        return toInt(obj);
    }

    /**
     * ǿת->Long
     *
     * @param obj
     * @return
     */
    public static long toLong(Object obj) {
        return Long.parseLong(obj.toString());
    }

    /**
     * ǿת->Long
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long toLong(Object obj, long defaultValue) {
        if (isEmpty(obj)) {
            return defaultValue;
        }
        return toLong(obj);
    }

    /**
     * ǿת->Double
     *
     * @param obj
     * @return
     */
    public static double toDouble(Object obj) {
        return Double.parseDouble(obj.toString());
    }

    /**
     * ǿת->Boolean
     *
     * @param obj
     * @return
     */
    public static Boolean toBoolean(Object obj) {
        return Boolean.parseBoolean(obj.toString());
    }

    /**
     * ǿת->Boolean
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static Boolean toBoolean(Object obj, Boolean defaultValue) {
        if (isEmpty(obj)) {
            return defaultValue;
        }
        return toBoolean(obj);
    }

    /**
     * ǿת->java.util.Date
     *
     * @param str �����ַ���
     * @return
     */
    public static Date toDate(String str) {
        try {
            if (str == null || "".equals(str.trim()))
                return null;
            return new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str.trim());
        } catch (Exception e) {
            throw new RuntimeException("Can not parse the parameter \"" + str + "\" to Date value.");
        }
    }

    /**
     * Arrayת�ַ���(��ָ�����ŷָ�)
     *
     * @param array
     * @param sign
     * @return
     */
    public static String join(Object[] array, char sign) {
        if (array == null) {
            return null;
        }
        int arraySize = array.length;
        int bufSize = (arraySize == 0 ? 0 : ((array[0] == null ? 16 : array[0].toString().length()) + 1) * arraySize);
        StringBuilder sb = new StringBuilder(bufSize);

        for (int i = 0; i < arraySize; i++) {
            if (i > 0) {
                sb.append(sign);
            }
            if (array[i] != null) {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    /**
     * ɾ��ĩβ�ַ���
     *
     * @param str  �������ַ���
     * @param sign ��Ҫɾ���ķ���
     * @return
     */
    public static String delEnd(String str, String sign) {
        if (str.endsWith(sign)) {
            return str.substring(0, str.lastIndexOf(sign));
        }
        return str;
    }


    /**
     * ���ĺ�����
     *
     * @param time
     */
    public static void costTime(long time) {
        System.err.println("Load Cost Time:" + (System.currentTimeMillis() - time) + "ms\n");
    }

    /**
     * ��ʽ�����JSON
     *
     * @param json
     * @return
     */
    public static String formatJson(String json) {
        int level = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < json.length(); i++) {
            char c = json.charAt(i);
            if (level > 0 && '\n' == sb.charAt(sb.length() - 1)) {
                sb.append(getLevelStr(level));
            }
            switch (c) {
                case '{':
                case '[':
                    sb.append(c + "\n");
                    level++;
                    break;
                case ',':
                    sb.append(c + "\n");
                    break;
                case '}':
                case ']':
                    sb.append("\n");
                    level--;
                    sb.append(getLevelStr(level));
                    sb.append(c);
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }

    private static String getLevelStr(int level) {
        StringBuffer levelStr = new StringBuffer();
        for (int levelI = 0; levelI < level; levelI++) {
            levelStr.append("  ");
        }
        return levelStr.toString();
    }

    public static int getCount(String str, String scan) {
        int count = 0;
        int index = 0;
        while (((index = str.indexOf(scan)) != -1)) {
            //����취��ȡ�ַ����в����ַ�,�������ҵ�ǰƥ���ַ�֮����ַ�������
            //��ֵ���ַ���
            str = str.substring(index + 1);
            count++;
        }
        return count;
    }


}
