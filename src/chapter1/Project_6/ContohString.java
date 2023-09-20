//package chapter1.Project_6;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.StringJoiner;
//
//public class ContohString {
//    public static void main(String[] args) {
//        String nama = "buah";
//        String hobby = "main";
//        int umur = 10;
//
////        concat digunakan untuk menggabung 2 string
////        System.out.println(nama.concat(hobby));
////        tanda +  bisa digunakan untuk menggabungkan 2 tiipe data yg berbeda
////        System.out.println(nama + hobby);
////        System.out.println(nama+ umur);
//
////        StringBuffer
////        StringBuffer sb = new StringBuffer("");
////        sb.append("Java ");
////        sb.append("Backend");
////        String str = sb.toString();
////        System.out.println("String Object: " + str);
//
////        String Builder
////        StringBuilder sbu= new StringBuilder("");
////        sbu.append("Java  ");
////        sbu.append("Backend");
////        System.out.println(sbu);
////        String strs = sb.toString();
////        System.out.println("String Object: " +strs);
//
////        String Joiner
////        String[] rgbList = new String[3];
//////        rgbList[0] = "red";
//////        rgbList[1] = "blue";
//////        rgbList[2] = "green";
//////        StringJoiner  rgbJoiner = new StringJoiner(",");
//////        for (int i = 0; i < rgbList.length ; i++) {
//////            rgbJoiner.add(rgbList[i]);
//////        }
//////        System.out.println(rgbJoiner.toString());
//
////        String Joiner with prefix suffix
//        StringJoiner joiner = new StringJoiner(", ", "[", "]"); // Delimiter = ", ", Prefix = "[", Suffix = "]"
//
//        joiner.add("Apple");
//        joiner.add("Banana");
//        joiner.add("Cherry");
//
//        String result = joiner.toString(); // Hasil: "[Apple, Banana, Cherry]"
//        System.out.println(result);
//
////        buffered reader
//
//
//
//    }
////    public static void read (String csvFile){
////        try {
////            File file = new File(csvFile);
////            FileReader fr = new FileReader(file);
////            BufferedReader br =  new BufferedReader(fr);
////            String line = '';
////            String[] tempArr;
////
////            while((line =br.readLine())!=null){
////                tempArr = line.split(delimiter)
////            }
////
////        }
//        }
//
//    }
