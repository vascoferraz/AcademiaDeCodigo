class StringFrontBack {

public static void main(String[] args) {

    frontBack("heisenberg");

    //receive command line argument if available
    if(args.length>0){
      frontBack(args[0]);
    }
}

private static void frontBack(String str) {

    // print result here
    int strlen = str.length();
    System.out.println(strlen);
    char temp;
    char ch_zero = str.charAt(0);
    char ch_last = str.charAt(strlen-1);
  

    System.out.println(ch_last + str.substring(1,strlen-1) + ch_zero);
}

}