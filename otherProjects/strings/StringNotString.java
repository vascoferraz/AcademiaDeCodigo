class StringNotString {

public static void main(String[] args) {

    notString("semicolon");
    notString("not semicolon");

    //receive command line argument if available
    if(args.length>0){
      notString(args[0]);
    }

}

private static void notString(String str) {

    // print result here
    if (str.substring(0,3).equals("not"))
	{
         System.out.println(str);
	}
	
	else
	{
         System.out.println("not " + str);
	}

}

}