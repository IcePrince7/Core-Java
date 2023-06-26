import java.util.Scanner;

public class HCL_Channel_Changer {

public static void main(String[] args) {

//Assuming Number of cahnnels available as 10

Scanner Ask = new Scanner(System.in);

int ChannelCount = 11;
String ChannelName[] = {"Star Utsav","Sai Tv","Zee news","Star Movies","NGC","NDTV","INDIA Today","Sun music","Comedy Cendral","DD National"};

for(int i =0; i < ChannelCount ;i++) {

System.out.println("You are watching the "+ChannelName[i]+ " channel.\nIf you bored type 1 to change the channel");

int channelChanger = Ask.nextInt();

if(channelChanger==1) System.out.println("We are changing your channel... Please wait");

if(i ==9) {

System.out.println("You are in end of the Channel List, Do you wish to surf Again!"

+ "\nPress 1 for Yes or 2 for No");

int Confirm = Ask.nextInt();

if(Confirm == 1) i =0;

else break;

}

}

System.out.println("End of channel list");}}

