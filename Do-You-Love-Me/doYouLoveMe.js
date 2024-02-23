function yes() {
  alert('Vợ yêu, Anh yêu em!');
}
function no() {
  let x = Math.round(Math.random() * window.innerWidth);
  let y = Math.round(Math.random() * window.innerHeight);
  document.getElementById('clickNo').style.left = x + 'px';
  document.getElementById('clickNo').style.top = y + 'px';
}
