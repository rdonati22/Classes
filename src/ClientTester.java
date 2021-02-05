import java.util.Arrays;

/* A company maintains client lists where each list is a sorted
array of clients stored in ascending order by client.  A client
may appear in more than one list, but will not appear more than
once in the same list.
Write method prefixMerge(), which takes 3 array parameters.  The
first 2 arrays, list1 and list2, represent existing client lists.
It is possible that some clients are in both arrays.  The third
array, result, has been instantiated to a length that is no longer
than either of the other 2 arrays and initially contains null
values.  Method prefixMerge() merges the lists in ascending order
with no duplicates until all positions of result are filled.  Clients
who appear in both list1 and list2 will appear at most once in result.
You must use compareClient() in your solution and you may not create
any additional arrays.
 */
public class ClientTester {
    // fills result with clients merged from the beginning of
    // list1 and list2;
    // result contains no duplicates and is sorted in ascending
    // order by customer
    // precondition: result.length > 0
    //               list1.length > result.length;
    //               list1 contains no duplicates
    //               list2.length > result.length;
    //               list2 contains no duplicates
    //               list1 and list2 are sorted in ascending order
    //               by client
    // postcondition: list1 and list2 are not modified

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result){
//        int len = result.length;
//        for (int i = 0; i < len; i++){
//            if (list1[i].compareClient(list2[i]) < 0){
//                result [i] = list1[i];
//            }
//            else {
//                result [i] = list2[i];
//            }
//        }
//    }

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result){
//        int len = result.length;
//        int index1 = 0;
//        int index2 = 0;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++){
//                if (result)
//            }
//            if (list1[0].compareClient(list2[0]) < 0) {
//                result[0] = list1[0];
//            }
//            if (list1[1].compareClient(list2[0]) < 0) {
//                result[1] = list1[1];
//            }
//        }
//    }

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result) {
//        int len = result.length;
//        boolean lessThan = true;
//        for (int index = 0; index < len; index++) {
//            for (int i = 0; i < len; i++) {
//                if (list1[index].compareClient(list2[i]) > 0) {
//                    lessThan = false;
//                }
//            }
//            if (lessThan) {
//                result[index] = list1[index];
//            }
//        }
//    }

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result) {
//        int len = result.length;
//        int index1 = 0;
//        int index2 = 0;
//        int index3 = 0;
//        boolean lessThan1 = true;
//        boolean lessThan2 = true;
//        for (int j = 0; j < len; j++){
//            for (int i = 0; i < len; i++) {
//                if (list1[index1].compareClient(list2[i]) > 0) {
//                    lessThan1 = false;
//                }
//            }
//            if (lessThan1) {
//                result[index3] = list1[index1];
//                index1++;
//                index3++;
//            }
//            else {
//                for (int i = 0; i < len; i++) {
//                    if (list2[index2].compareClient(list1[i]) > 0) {
//                        lessThan2 = false;
//                    }
//                }
//                if (lessThan2) {
//                    result[index3] = list2[index2];
//                    index2++;
//                    index3++;
//                }
//            }
//        }
//    }

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result) {
//        int len = result.length;
//        for (int i = 0; i < len; i++) {
//            result[i] = list1[i];
//        }
//        //int k =0;
//        for (int k = 0; k < list2.length; k++) {
//            for (int j = 0; j < len; j++) {
//                if (list2[k].compareClient(list1[j]) < 0) {
//                    result[j] = list2[k];
//                    for (int l = j + 1; l < len; l++) {
//                        result[l] = result[l - 1];
//                    }
//                    j = len;
//                }
//            }
//        }
//    }

//    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result) {
//        int len = result.length;
//        for (int i = 0; i < len; i++) {
//            result[i] = list1[i];
//        }
//        //int k =0;
//        boolean resultContains = false;
//        for (int k = 0; k < list2.length; k++) {
//            for (int j = 0; j < len; j++) {
//                if (list2[k] == result[j]) {
//                    resultContains = true;
//                }
//            }
//        }
//        if (!resultContains){
//
//        }
//    }

    public static void prefixMerge(Client [] list1, Client [] list2, Client[] result){
        int len = result.length;
        //int index = 0;
        for (int i = 0; i < len; i++){
            if (list1[i].compareClient(list2[i]) < 0){
                result[i] = list1[i];
            }
            else{
                result[i] = list2[i];
            }
        }
        for (int j = 0; j < len; j++) {
            for (int k = 0; k < len; k++) {
                if (list2[j].compareClient(list1[k]) != 0){
                    result[k] = list2[j];
                    for (int l = j + 1; l < len; l++) {
                        result[l] = result[l - 1];
                    }
                }
            }
        }
    }

    public static void main(String [] args){
        Client c1 = new Client("Anton", 101);
        Client c2 = new Client("Bradley", 102);
        Client c3 = new Client("Bradley", 103);
        Client c4 = new Client("Cho", 104);
        Client c5 = new Client("Dahl", 105);
        Client c6 = new Client("Edgerton", 106);
        Client c7 = new Client("Edgerton", 107);
        Client c8 = new Client("Fleetwood", 108);

        Client [] list1 = {c1,c3,c4,c5,c7,c8};
        Client [] list2 = {c2,c3,c5,c6,c7};
        Client [] list3 = {c3,c5,c6};


        Client [] result1 = new Client[5];
        prefixMerge(list1,list2,result1);
        System.out.println(Arrays.toString(result1));

        Client [] result2 = new Client[3];
        prefixMerge(list2,list3,result2);
        System.out.println(Arrays.toString(result2));

        Client [] result3 = new Client[3];
        prefixMerge(list3,list1,result3);
        System.out.println(Arrays.toString(result3));

    }
}