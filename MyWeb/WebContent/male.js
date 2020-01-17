
window.onload = function () {

var chart = new CanvasJS.Chart("MaleGraph", {
animationEnabled: true,
theme: "light2",
title:{
  text: "Male Age Line Chart"
},
axisY:{
  includeZero: false
},
data: [{
  type: "line",
  dataPoints: [
    { y: 21 },
    { y: 23 },

  ]
}]
});
chart.render();
}
