




































































































import java.util.*;
class Transcipher{
public staic void Main(srting args []){
Scanner sc=new Scnner(System.in);
String p1=sc next line();
sc.close();
Srting s="";
int start=0;
for(int i=0;i<p1,length(): i++){
if(p1.charAT(i)=="")
{
S=s+p1.sub String(start,i);
strat=i+1;
 }
}
S=s+p1.sub String(start0);
System.out.print(S);
System.out.println();
int k=s.length();
int 1=0;
int col=4;
int row=s.length()/col;
char ch[][]=newchar[row][10];
for(int i=0;j<col;j++){
if(1<k){
chi[i][j]=s.chartAT (1);
1++;
}else{
ch[i][j]='#';
  }
 }
}
char tras[][]new char[col][row];
for(inti=o;i<row;i++)
for(intj=0;j<col;j++){
trans[j][i]=ch[i][j];
 }
}
for(inti=0;i<col;i++){
for(intj=0;j<row:j++){
System.out.print(trans[i][j];
 }
}
System.out.println();
 }
}

















































