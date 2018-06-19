<div id="brinza-task-description">
<p>John was sitting near to a fireplace in his house, trying to get some warmth from the fire. Fighting his cold at the end of a freezing, short, dark winter day, he started wondering why it always had to be so cold during this season. That was when he came up with an idea.</p>
<p>John stated that winter is the initial part of the year in which it is always colder than in the remaining part. This latter part is called 'summer'. Then he assumed that summer is always warmer than winter; that is, any temperature measured in winter is colder than every temperature measured in summer.</p>
<p>Then he searched the Internet and found the previous year's meteorological data, which contained the year's temperature measurements. He began to wonder if it might be possible to divide the year into winter and summer so that winter comes before summer and each winter's temperature measurement is smaller than any temperature measured in summer. In case there are many such possible partitions, find the one in which the winter period is as short as possible. (It is quite cold now; there is really no reason for winter to be longer than necessary...)</p>
<p>Write a function:</p>
<blockquote><p style="font-family: monospace; font-size: 9pt; display: block; white-space: pre-wrap"><tt>class Solution { public int solution(int[] T); }</tt></p></blockquote>
<p>that, given a sequence <tt style="white-space:pre-wrap">T</tt> of temperature measurements (specified as integer numbers), finds the partition of the year into winter and summer that meets the conditions above and makes winter as short as possible, then returns the length of the winter. Both winter and summer have to be at least one day long. You can assume that there exists at least one partition that satisfies this condition.</p>
<p>For example, given:</p>
<tt style="white-space:pre-wrap">    T = [5, -2, 3, 8, 6]</tt>
<p>the function should return 3, as after partitioning the year into winter: <tt style="white-space:pre-wrap">[5, -2, 3]</tt> and summer: <tt style="white-space:pre-wrap">[8, 6]</tt>, each winter's measurement is smaller than each summer's temperature.</p>
<p>On the other hand, for the following array:</p>
<tt style="white-space:pre-wrap">    T = [-5, -5, -5, -42, 6, 12]</tt>
<p>the function should return 4. The partition that minimizes the length of the winter is <tt style="white-space:pre-wrap">[-5, -5, -5, -42]</tt> and <tt style="white-space:pre-wrap">[6, 12]</tt>. Winter could also have length 5, but the function should return the shortest possible winter.</p>
<p>Assume that:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>N is an integer within the range [<span class="number">2</span>..<span class="number">300,000</span>];</li>
<li>each element of array T is an integer within the range [<span class="number">−1,000,000,000</span>..<span class="number">1,000,000,000</span>];</li>
<li>There will be at least one correct way to divide the year into winter and summer.</li>
</ul>
</blockquote><p>Complexity:</p>
<blockquote><ul style="margin: 10px;padding: 0px;"><li>expected worst-case time complexity is O(N);</li>
<li>expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).</li>
</ul>
</blockquote><p>Elements of input arrays can be modified.</p>
</div>
