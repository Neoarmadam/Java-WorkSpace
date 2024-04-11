package ejercicio3;

public class Modelo3 {
	
	public char obtenerDNI(int num) {
		int result= num%23;
		char letra='f';
		if (result==0) {
			letra='T';
		}
		if (result==1) {
			letra='R';
		}
		if (result==2) {
			letra='W';
		}
		if (result==3) {
			letra='A';
		}
		if (result==4) {
			letra='G';
		}
		if (result==5) {
			letra='M';
		}
		if (result==6) {
			letra='Y';
		}
		if (result==7) {
			letra='F';
		}
		if (result==8) {
			letra='P';
		}
		if (result==9) {
			letra='D';
		}
		if (result==10) {
			letra='X';
		}
		if (result==11) {
			letra='B';
		}
		if (result==12) {
			letra='N';
		}
		if (result==13) {
			letra='J';
		}
		if (result==14) {
			letra='Z';
		}
		if (result==15) {
			letra='S';
		}
		if (result==16) {
			letra='Q';
		}
		if (result==17) {
			letra='V';
		}
		if (result==18) {
			letra='H';
		}
		if (result==19) {
			letra='L';
		}
		if (result==20) {
			letra='C';
		}
		if (result==21) {
			letra='K';
		}
		if (result==22) {
			letra='E';
		}	
		return letra;
	}
	
	
	public int comprobarDNI(int num, char letra) {
		int result= num%23;
		if (result==0) {
			if(letra=='t'||letra=='T') {
				result=-1;
			}
		}
		if (result==1) {
			if(letra=='r'||letra=='R') {
				result=-1;
			}
		}
		if (result==2) {
			if(letra=='W'||letra=='w') {
				result=-1;
			}
		}
		if (result==3) {
			if(letra=='A'||letra=='a') {
				result=-1;
			}
		}
		if (result==4) {
			if(letra=='G'||letra=='g') {
				result=-1;
			}
		}
		if (result==5) {
			if(letra=='M'||letra=='m') {
				result=-1;
			}
		}
		if (result==6) {
			if(letra=='y'||letra=='Y') {
				result=-1;
			}
		}
		if (result==7) {
			if(letra=='F'||letra=='f') {
				result=-1;
			}
		}
		if (result==8) {
			if(letra=='P'||letra=='p') {
				result=-1;
			}
		}
		if (result==9) {
			if(letra=='D'||letra=='d') {
				result=-1;
			}
		}
		if (result==10) {
			if(letra=='x'||letra=='X') {
				result=-1;
			}
		}
		if (result==11) {
			if(letra=='b'||letra=='B') {
				result=-1;
			}
		}
		if (result==12) {
			if(letra=='N'||letra=='n') {
				result=-1;
			}
		}
		if (result==13) {
			if(letra=='j'||letra=='J') {
				result=-1;
			}
		}
		if (result==14) {
			if(letra=='z'||letra=='Z') {
				result=-1;
			}
		}
		if (result==15) {
			if(letra=='s'||letra=='S') {
				result=-1;
			}
		}
		if (result==16) {
			if(letra=='Q'||letra=='q') {
				result=-1;
			}
		}
		if (result==17) {
			if(letra=='V'||letra=='v') {
				result=-1;
			}
		}
		if (result==18) {
			if(letra=='H'||letra=='h') {
				result=-1;
			}
		}
		if (result==19) {
			if(letra=='L'||letra=='l') {
				result=-1;
			}
		}
		if (result==20) {
			if(letra=='c'||letra=='C') {
				result=-1;
			}
		}
		if (result==21) {
			if(letra=='k'||letra=='K') {
				result=-1;
			}
		}
		if (result==22) {
			if(letra=='e'||letra=='E') {
				result=-1;
			}
		}	
		return result;
	}
}
