class MissingChar {

	public static void main(String[] args) {

  	missingChar("Robocop", 3);

  	//receive command line argument if available
  	if(args.length>=2){
    	missingChar(args[0], Integer.parseInt(args[1]));
  	}
}


private static void missingChar(String str, int n) {

  // print result here
  System.out.println(str.substring(0,n) + str.substring(n+1));
}

}