package com.sr.srquiz.page1;

import java.util.Scanner;


public class QuizApp {
	public static void main( String[] args) {
		System.out.println("     ****** QUIZZ APP *******    ");
		int life_line=1;
		String GREEN="\u001B[32m";
		String RED="\u001B[31m";
		String RESET="\u001B[0m";
		String BLUE="\u001B[34m";
		
		int reward =0;		
		Scanner sc=new Scanner(System.in);
		System.out.println(               );
		System.out.println("   ______ LOGIN ______    ");
		System.out.println(   );
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("Enter your Mobile Number :");
		
		String Mobile=sc.next();
		
		System.out.println("LOGIN SUCCESSFULLY");
		System.out.println("********************************");
		System.out.println("1)What is the Addition symbol ?");
		System.out.println("a) +     b) -      c) *   d) /    e)Life line");
		System.out.println("Enter your answer: ");
		char ans1=sc.next().charAt(0);
		if(ans1=='a'|| ans1=='A') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans1=='e' || ans1=='E') {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char option=sc.next().charAt(0);
		    if(option=='1') {
		    	
		    	System.out.println(" a) +  --->60%");
		    	System.out.println(" b) -  --->20%");
		    	System.out.println(" c) /  --->15%");
		    	System.out.println(" d) *  --->5%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='a'||aud_opt=='A') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(option=='2' && life_line==1){
		    	System.out.println("a) +   b) -");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='a'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }
		}
		else {
			System.out.println(RED+"your answer is wrong"+RESET);
			System.exit(0);
		
		}

		
		System.out.println("--------------------------------");
		System.out.println("2)What is the Modulus symbol ?");
		System.out.println("a) +     b) -      c) *   d) %    e)Life line");
		System.out.println("Enter your answer: ");
		
		char ans2=sc.next().charAt(0);
		
		if(ans2=='d'|| ans2=='D') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans2=='e'&& life_line==1 || ans2=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) +  --->10%");
		    	System.out.println(" b) -  --->20%");
		    	System.out.println(" c) %  --->55%");
		    	System.out.println(" d) *  --->15%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='d'||aud_opt=='D') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("c) +   d) %");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='d'|| choose=='D'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans2=='e' || ans2=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) +     b) -      c) *   d) %   ");
				char ans=sc.next().charAt(0);
				if(ans=='d'||ans=='D') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		
		
		System.out.println("--------------------------------");
		System.out.println("3)What is the multiplication symbol ?");
		System.out.println("a) +     b) -      c) *   d) /    e)Life line");
		System.out.println("Enter your answer: ");
		
		char ans3=sc.next().charAt(0);
		if(ans3=='c'|| ans3=='C') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans3=='e'&& life_line==1 || ans3=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) +  --->10%");
		    	System.out.println(" b) -  --->20%");
		    	System.out.println(" c) *  --->55%");
		    	System.out.println(" d) %  --->15%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='c'||aud_opt=='C') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("c) *   d) %");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='c'|| choose=='C'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans3=='e' || ans3=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) +     b) -      c) *   d) %   ");
				char ans=sc.next().charAt(0);
				if(ans=='c'||ans=='C') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("4)What is the Subtraction symbol ?");
		System.out.println("a) +     b) -      c) *   d) /    e)Life line");
		
		System.out.println("Enter your answer: ");
		char ans4=sc.next().charAt(0);
		
		if(ans4=='b'|| ans4=='B') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans4=='e'&& life_line==1 || ans4=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) +  --->10%");
		    	System.out.println(" b) -  --->50%");
		    	System.out.println(" c) *  --->25%");
		    	System.out.println(" d) %  --->15%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='b'||aud_opt=='B') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("c) *   d) %");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='b'|| choose=='B'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans4=='e' || ans4=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) +     b) -      c) *   d) %   ");
				char ans=sc.next().charAt(0);
				if(ans=='b'||ans=='B') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("5)What is the Division symbol ?");
		System.out.println("a) +     b) -      c) *   d) /    e)Life line");
		
		System.out.println("Enter your answer: ");
		char ans5=sc.next().charAt(0);
		
		if(ans5=='d'|| ans5=='D') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans5=='e'&& life_line==1 || ans5=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) +  --->10%");
		    	System.out.println(" b) -  --->15%");
		    	System.out.println(" c) *  --->25%");
		    	System.out.println(" d) /  --->50%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='d'||aud_opt=='D') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("c) *   d) /");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='d'|| choose=='D'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans5=='e' || ans5=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) +     b) -      c) *   d) /   ");
				char ans=sc.next().charAt(0);
				if(ans=='d'||ans=='D') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("6)What are the logical operators in java ?");
		System.out.println("a) &&,||,!!   b)  +,-,*,/,%   c) ==,+=   d) <,>    e)Life line");
		
		System.out.println("Enter your answer: ");
		
		char ans6=sc.next().charAt(0);
		
		if(ans6=='a'|| ans6=='A') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans6=='e'&& life_line==1 || ans6=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) &&,||,!!  --->50%");
		    	System.out.println(" b) -  --->15%");
		    	System.out.println(" c) *  --->25%");
		    	System.out.println(" d) /  --->10%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='a'||aud_opt=='A') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("a) &&,||,!!   d) /");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='a'|| choose=='A'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans6=='e' || ans6=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) &&,||,!!     b) -      c) *   d) /   ");
				char ans=sc.next().charAt(0);
				if(ans=='a'||ans=='A') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("7)What are the Arthematic operators in java ?");
		System.out.println("a) &&,||,!!   b)  +,-,*,/,%   c) ==,+=   d) <,>    e)Life line");
		
		System.out.println("Enter your answer: ");
		
		char ans7=sc.next().charAt(0);
		
		if(ans7=='b'|| ans7=='B') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans7=='e'&& life_line==1 || ans7=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) &&,||,!!  --->15%");
		    	System.out.println(" b) +,-,*,/,%   --->50%");
		    	System.out.println(" c) ==,+=  --->25%");
		    	System.out.println(" d)  <,>  --->10%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='b'||aud_opt=='B') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("a) &&,||,!!   b) +,-,*,/,% ");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='b'|| choose=='B'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans7=='e' || ans7=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) &&,||,!!     b)  +,-,*,/,%   c) ==,+=   d) <,>    ");
				char ans=sc.next().charAt(0);
				if(ans=='b'||ans=='B') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("8)What are the Relational operators in java ?");
		System.out.println("a) &&,||,!!   b)  +,-,*,/,%   c)<,>,<=,>=,==,!=    d) T,F   e)Life line");
		
		System.out.println("Enter your answer: ");
		
		char ans8=sc.next().charAt(0);
		
		if(ans8=='c'|| ans8=='C') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans8=='e'&& life_line==1 || ans8=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) &&,||,!!  --->15%");
		    	System.out.println(" b) +,-,*,/,%   --->25%");
		    	System.out.println(" c) <,>,<=,>=,==,!=   --->50%");
		    	System.out.println(" d)  T,F --->10%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='c'||aud_opt=='C') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("  b) +,-,*,/,%   c) <,>,<=,>=,==,!=  ");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='c'|| choose=='C'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans8=='e' || ans8=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) &&,||,!!     b)  +,-,*,/,%   c)<,>,<=,>=,==,!=    d) T,F   ");
				char ans=sc.next().charAt(0);
				if(ans=='c'||ans=='C') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("9)What are the assignment operators in java ?");
		System.out.println("a) &&,||,!!   b)  +,-,*,/,%   c)<,>,<=,>=,==,!=    d) =,+=,-=,*=,/=,%=,--,++   e)Life line");
		
		System.out.println("Enter your answer: ");
		
		char ans9=sc.next().charAt(0);
		
		if(ans9=='d'|| ans9=='D') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward ="+reward);
			
			
		}
		else if(ans9=='e'&& life_line==1 || ans9=='E' && life_line==1) {
			System.out.println("options  :  1) Audience poll    2) 50-50 ");
			System.out.println(" Select option :");
		    char opt=sc.next().charAt(0);
		    if(opt=='1') {
		    	
		    	System.out.println(" a) &&,||,!!  --->15%");
		    	System.out.println(" b) +,-,*,/,%   --->25%");
		    	System.out.println(" c) <,>,<=,>=,==,!=   --->10%");
		    	System.out.println(" d)  =,+=,-=,*=,/=,%=,--,++ --->50%");
		    	char aud_opt=sc.next().charAt(0);
		    	System.out.println(" select option :  ");
		    	if (aud_opt=='d'||aud_opt=='D') {
			    	System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			    	reward=reward+100;
			    	System.out.println("reward ="+reward);
			    	System.out.println(BLUE+"life line is used"+RESET);
			    	life_line=life_line+1;
		    	}
		    	
		    	
		    	
		    }
		    else if(opt=='2' && life_line==1){
		    	System.out.println("    c) <,>,<=,>=,==,!=    d)  =,+=,-=,*=,/=,%=,--,++ ");
		    	char choose=sc.next().charAt(0);
		    	if(choose=='d'|| choose=='D'){
		    		System.out.println(GREEN+"your answer is correct"+RESET);
		    		reward=reward+100;
		    		System.out.println("reward ="+reward);
		    		System.out.println(BLUE+"life line is used"+RESET);
		    		
		    		life_line=life_line+1;
		    	}
		    	else {
		    		
		    		System.out.println(RED+"you lost the life line"+RESET);
		    		life_line=life_line+1;
		    		
		    	
		    	}
		    }System.out.println("no lifelines");
		}
		else {
			if( ans9=='e' || ans9=='E') {
				System.out.println("NO life lines are available");
				
				System.out.println("select below options");
				System.out.println("a) &&,||,!!     b)  +,-,*,/,%   c)<,>,<=,>=,==,!=     d)  =,+=,-=,*=,/=,%=,--,++  ");
				char ans=sc.next().charAt(0);
				if(ans=='d'||ans=='D') {
					System.out.println(GREEN+"your answer is correct"+RESET);
					reward=reward+100;
					System.out.println("reward= "+reward);
				}
				else {
					System.out.println(RED+"your answer is wrong"+RESET);
					System.exit(0);
				}
			}
			
		
		}
		System.out.println("--------------------------------");
		System.out.println("10)How many loops in java ?");
		System.out.println("a) 1  b)  2   c)3    d) 4   ");
		
		System.out.println("Enter your answer: ");
		
		char ans10=sc.next().charAt(0);
		
		if(ans10=='d'|| ans10=='D') {
			System.out.println(GREEN+"Congratulations 🎉 your answer is correct"+RESET);
			reward=reward+100;
			System.out.println("reward= "+reward);
			System.out.println("You won the QUIZZ");
			
		}
		else {
			System.out.println(RED+"your answer is incorrect 😢"+RESET);
			System.out.println("You lost the game");
		}
		System.out.println(" __________________GAME OVER________________ ");
    }
	
 
}