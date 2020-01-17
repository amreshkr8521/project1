
window.onload = function () {

var chart = new CanvasJS.Chart("FemaleGraph", {
animationEnabled: true,
theme: "light2",
title:{
  text: "Female Age Line Chart"
},
axisY:{
  includeZero: false
},
data: [{
  type: "line",
  dataPoints: [
    { y: 20 },


  ]
}]
});
chart.render();
}
