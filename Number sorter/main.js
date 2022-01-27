const numbers = [1, 8, 4, 5, 2, 4, 564, 6, 7, 9, 4, 7, 5, 6, 9];
let max = 0;

for (const number of numbers) {
	if (max < number) max = number;
}

console.log(max);
