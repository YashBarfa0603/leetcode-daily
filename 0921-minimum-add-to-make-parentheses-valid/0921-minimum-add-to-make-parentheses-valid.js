/**
 * @param {string} s
 * @return {number}
 */
var minAddToMakeValid = function(s) {
    let close = 0;
    let open = 0;
    for(let ch of s){
        if(ch == '('){
            open++;
        }else{
            if(open > 0){
                open--;
            }else{
                close++;
            }
        }
    }
    return open + close;
};