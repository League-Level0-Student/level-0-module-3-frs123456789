
int x1 = 100;
int x2 = 900;



void setup(){
  
 size(1000,200);
  

  
  
  
}
void draw(){
  background(255,255,255);
  x1+=1;
  x2-=1;
  
noFill();
  
for(int i=200; i>10; i=i-10) {
  
 ellipse(x1,100,i,i);
  
}

 for(int i=200; i>10; i=i-10) {
  
 ellipse(x2,100,i,i);
  
}}