<?php
$index = 1475;
$key = $index > 0 ? $index - 1 : 0;
(int) $n = [0 => 1, 1 => 1];

$t0 = microtime(true);
for ($i=2; $i <= $key; $i++) { 
	$n[$i] = $n[$i -1] + $n[$i-2];	
	unset($n[$i-2]);
}
$t1 = microtime(true);

echo "Value: ". $n[$key] . " " . (($t1 - $t0)/10^9) . "ms ";