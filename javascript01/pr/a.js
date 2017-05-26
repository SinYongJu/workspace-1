function hopscotch(board, size) {
	var result = 0;
  var max;
  var no = 0;

  for(var i =0; i<size; i++){ // size 만큼 반복... length;
    max = board[i][0];
  	for(var j=0; j<4; j++){
      if (j == no){
        j++;
      }
      if(max <= board[i][j]){
        max = board[i][j]
        no = j+1;
      }
    }
    result += max;
  }

	return result;
}

 //아래는 테스트로 출력해 보기 위한 코드입니다.
var board = [[ 1, 2, 3, 5 ], [ 5, 6, 7, 8 ], [ 4, 3, 2, 1]];
console.log(hopscotch(board, 3));
