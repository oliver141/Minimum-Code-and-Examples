float imageX, imageY, imageWidth, imageHeigth, imageWidthRatio=0.0, imageHeightRatio=0.0;
float largerDimension, smallerDimension;
PImage pic;
Boolean widthLarger=false, heightLarger=false;
void setup(){
size(1000, 800); 
pic = loadImage("toocutedog.jpg"); 
int picWidth = 800; 
int picHeight = 600; 
if ( picWidth >= picHeight ) {
  largerDimension = picWidth;
  smallerDimension = picHeight;
  widthLarger = true;
} else {
  largerDimension = picHeight;
  smallerDimension = picWidth;
  heightLarger = true;
}
println(smallerDimension, largerDimension, widthLarger, heightLarger); 
if ( widthLarger == true ) imageWidthRatio = largerDimension / largerDimension;
if ( widthLarger == true ) imageHeightRatio = smallerDimension / largerDimension;
if ( heightLarger == true ) imageHeightRatio = largerDimension / largerDimension;
if ( heightLarger == true ) imageWidthRatio = smallerDimension / largerDimension;
println(imageWidthRatio, imageHeightRatio, smallerDimension/largerDimension, 600.0/800.0); //Verify variable values
imageX = width*0;
imageY = height*0;
imageWidth = width*imageWidthRatio;
imageHeigth = height*imageHeightRatio;
if ( imageWidth > width ) println("ERROR: Image is too wide"); 
if ( imageHeigth > height ) println("ERROR: Image is too high"); 
rect(imageX, imageY, imageWidth, imageHeigth);
image(pic, imageX, imageY, imageWidth, imageHeigth);
textSize(24);
text("Damn, This dog is very cute.", width-400, 50);
}
