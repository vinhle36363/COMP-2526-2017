package ca.bcit.comp2526.a2a;

/**
 * RandomGenerator.
 * @author  BCIT
 * @version 1.0
 */
public final class RandomGenerator {
    private static final int[] NUMBERS;
    
    static {
        NUMBERS = new int[]
        {
            -1155484576,
            -723955400,
            1033096058,
            -1690734402,
            -1557280266,
            1327362106,
            -1930858313,
            502539523,
            -1728529858,
            -938301587,
            1431162155,
            1085665355,
            1654374947,
            -1661998771,
            -65105105,
            -73789608,
            -518907128,
            99135751,
            -252332814,
            755814641,
            1180918287,
            1344049776,
            553609048,
            1580443894,
            629649304,
            -1266264776,
            99807007,
            5955764,
            -1946737912,
            39620447,
            -152527805,
            -1877116806,
            448784075,
            1086124775,
            -1609984092,
            1227951724,
            1764356251,
            64111306,
            -960731419,
            -100082026,
            -39845375,
            -1339022546,
            2092649110,
            -568315836,
            -1089884900,
            -81839914,
            -1146103148,
            -1846688624,
            -784703072,
            55004124,
            -691960657,
            1770461755,
            -2032810463,
            -1177788003,
            -432352882,
            -65824064,
            575267217,
            -1949367821,
            356750287,
            798819494,
            -92022521,
            1318001577,
            -1192467086,
            -1412716779,
            -1223932479,
            276053035,
            615126903,
            1542603436,
            1988388716,
            1177882237,
            19265476,
            -1430871151,
            307082914,
            -1333570194,
            1496453452,
            -790542135,
            1455004595,
            -1690249972,
            -604059026,
            -290476856,
            -122204761,
            -1097539750,
            -576617062,
            -2002123957,
            -1663951485,
            193034304,
            768747578,
            1337360486,
            934457803,
            873612482,
            -624972850,
            355564760,
            41547336,
            1781447028,
            -1321591463,
            1081281446,
            -982203381,
            -222544851,
            -1233998085,
            -1331702554,
            907249073,
            206843130,
            -931610657,
            1697401307,
            -234791961,
            -996341162,
            61144662,
            -1638496702,
            1693091376,
            -1667947369,
            -627963836,
            105673451,
            -918940699,
            -300903254,
            -28037702,
            1358495114,
            -502062723,
            2056481282,
            731396580,
            617380302,
            -162912754,
            818693069,
            -1184143835,
            -410943565,
            -1385753324,
            1233308008,
            -840115328,
            -1474241772,
            1895913584,
            1376826901,
            1984652857,
            412901507,
            -632101198,
            2025024491,
            -2139603013,
            -1233011876,
            -34604646,
            -1854979571,
            -131984708,
            -1866233577,
            1516579035,
            1612513822,
            203005342,
            -911714850,
            307621155,
            13453556,
            125015832,
            483675743,
            2077347671,
            37011083,
            -120473323,
            2069609186,
            -46741469,
            1502566715,
            -998828580,
            -1206282339,
            -2141482063,
            -1550311379,
            1097472880,
            1449582151,
            1327824311,
            -1105846005,
            -651630279,
            -1174121238,
            223701431,
            810978550,
            43703267,
            835843581,
            1519786882,
            -772329283,
            372536197,
            -317962831,
            -642907139,
            -706495414,
            15792134,
            -1116133237,
            1322391079,
            -1231319713,
            -2011725892,
            1299386162,
            -348690342,
            1341976962,
            1190607957,
            -262501494,
            -540039728,
            -986836170,
            -1675546118,
            -1948015872,
            -392391576,
            638256747,
            191085745,
            -97160665,
            -1517309270,
            1375971382,
            2133755906,
            891811204,
            -2118700536,
            2110473668,
            -2058625827,
            861211557,
            1573507430,
            1625767564,
            2051434938,
            -1922104200,
            -1271440420,
            927536580,
            1386277121,
            1184911833,
            50057146,
            -185358571,
            -1284027987,
            -1025692308,
            -1093701172,
            -1116573039,
            -1686684117,
            2068400044,
            1009668318,
            -1847249948,
            1670927751,
            408998980,
            -380240510,
            1439774921,
            718930634,
            -1800042595,
            16808464,
            -1743967552,
            1137718941,
            252008887,
            -460347667,
            -1053605891,
            1278046001,
            947528252,
            1842130704,
            1599145891,
            -1341955486,
            1631478226,
            1754478786,
            -1370798799,
            1516348954,
            730123440,
            -1409786204,
            1491046204,
            -1114899725,
            -656053644,
            -453397258,
            -694901410,
            -1804067552,
            13393714,
            -2101289195,
            176533870,
            1339899789,
            -1511804464,
            -1974699707,
            -166068399,
            -115501757,
            86156176,
        };
    }
    
    private static int next;
    
    /**
     * RandomGenerator constructor.
     */
    private RandomGenerator() {
    }

    /**
     * This is reset method.
     */
    public static void reset() {
        next = 0;
    }

    /**
     * Giving a randomnumber.
     * @param max - maximum value
     * @return a random number from 0 to max
     */
    public static int nextNumber(final int max) {
        try {
            return (Math.abs(NUMBERS[next]) % max);
        } finally {
            next++;

            if (next >= NUMBERS.length) {
                next = 0;
            }
        }
    }      
}
