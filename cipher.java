import java.util*;
import java.io*;
public class caserciplier
{
public static final string ALPHABET="abcdefghijklmnopqrstuvwxyz";
public static string encrypt(string ptext,int cserkey)
{
string ctext="";
for(int i=0;i< ptext.length():i++)
{
int plainnumeric=ALPHABET.indexof(ptext,charAt(i);
int ciphernumeric=(plainnumeric+caerkey)%26
charcipherchar=ALPHABET.CHAR At(cipertnumeric):
ctext+=cipherchar;
{
retun ctext;
{
public static string dectypt (string ctext,int cserkey)
{
string ptext="";
for(inti=0;i< ctext.lenght();i++);
{
int ciphernumeric=ALPHABET.index of (ctext.charAt(i);
int plainnumeric=(cliphernumeric-cserkey)%26;
if (plainnumeric<0)
{
plainnumeric=ALPHABET.lenght()+plainnumeric;
{
char plainnumeric+ALPHABET.charAt(plainnumeric);
ptext+plainchar;
}
return ptext;
}
public static void main(string[]args)
throws IOException

{
Buffered Reader br=new Buffered Reader(new Input Stream Reader(system in));
system.out.print/n(Enter the PLANTEXTFOR Encrypttion);
string plaintext=new string();
string ciphertext=new string();
sring key;
int cserkey;
paintext=brread line();
system.out.print/n("Enter the CASERKEY between 0to25");
key=br.read line();
cserkey=Integer.paser/n+(key);
system.out.print/n("ENCRYPTION");
ciphertext=encrypt(plaintext,cserkey);
system.out.print/n(CIPHER TEXT;"+ciphertext);
system.out.print/n("DECRYPTION");
plaintext=decrypt(ciphertext,cserkey);
system.out.print/n("PLAIN TEXT;"plaintext);
}
}