/*******************************************************************************************************/
function moyenne(math, phy, inf) {
  var result = (math * 3 + phy * 4 + info * 5) / 12;
  return result;
}
/*******************************************************************************************************/
function mention(moyenne) {
  var result = "";
  if (moyenne >= 0 && moyenne <= 5) {
    result = "tres faible";
  }
  if (moyenne > 5 && moyenne <= 10) {
    result = "faible";
  }
  if (moyenne > 10 && moyenne <= 12) {
    result = "moyen";
  }
  if (moyenne > 12 && moyenne <= 15) {
    result = "bien";
  }
  if (moyenne > 15 && moyenne <= 20) {
    result = "tres bien";
  }
  return result;
}
/*******************************************************************************************************/
function bmiCalculator(sexe, height, weight) {
  var result=0; // initialisation 
  if (sexe === "homme") {
    result = weight / (height * height * 1.05);
  } else {
    if (sexe === "femme") {
      result = weight / (height * height * 1.1);
    } else {
      weight / (height * height * 1.15);
    }
  }
  return result;
}
/*******************************************************************************************************/
function minElement(t){
    min=t[0];
for(let i=1 ; i<t.length;++i){
    if(t[i]<min)
    min=t[i];
}
return min;
}
/*******************************************************************************************************/
function lastIndex(tab){
    index=-1;

    for(let i = 0 ;i < tab.length ; ++i){
        if(tab[i]<0)
        index=i;
    }
    return index;
}
/*******************************************************************************************************/
