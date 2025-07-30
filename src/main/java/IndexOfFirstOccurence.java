/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guero
 */
public class IndexOfFirstOccurence {

    public static void main(String[] args) {
        String haystack = "amasadbutsad";
        String needle = "sad";
        System.err.println(strStr(haystack, needle));

    }


    

    public static int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);

        }

        return -1;

    }

}
