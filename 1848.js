var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function (texto) { return lines.shift(); };

var numero, flag;

for (let i = 0; i < 3; i++) {
    numero = 0;
    flag = 0;
    while (flag === 0) {
        var corvo = prompt(" ");
        switch (corvo) {
            case "--*": numero += 1; break;
            case "-*-": numero += 2; break;
            case "-**": numero += 3; break;
            case "*--": numero += 4; break;
            case "*-*": numero += 5; break;
            case "**-": numero += 6; break;
            case "***": numero += 7; break;
            default: flag = 1; break;
        }
    }
    console.log(numero);
}