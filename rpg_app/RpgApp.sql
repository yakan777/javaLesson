1
SELECT * FROM パーティー:

2
SELECT 名称 AS 名前,HP AS 現在のHP,MP AS 現在のmp FROM パーティー;

3
SELECT * FROM イベント:

4
SELECT イベント番号 AS 番号,イベント名称 AS 場面 FROM `イベント`

5
INSERT INTO パーティー
VALUES('A01','スガワラ','21',131,232,null),
('A02','オーエ','10',156,84,null),
('A03','イズミ','20',84,190,null);

6
SELECT * FROM パーティー
WHERE id='C02'

7
UPDATE パーティー SET HP=HP-11
WHERE id='A01';

8
SELECT ID,名称,HP FROM パーティー
WHERE HP <100;

9
SELECT ID,名称,MP FROM パーティー
WHERE MP >=100;

10
SELECT イベント番号,イベント名称,タイプ FROM イベント
WHERE タイプ<>'3';

11
SELECT イベント番号,イベント名称 FROM イベント
WHERE イベント番号<5;

12
SELECT イベント番号,イベント名称 FROM イベント
WHERE イベント番号>=20;

13
SELECT イベント番号,イベント名称 FROM イベント
WHERE 前提イベント番号 IS null 

14
SELECT イベント番号,イベント名称,後続イベント番号 FROM イベント
WHERE 後続イベント番号 IS NOT null 

15
UPDATE パーティー SET 状態コード = '眠り'
WHERE 名称 LIKE '%ミ%'

16
SELECT ID,名称,HP FROM パーティー
WHERE HP BETWEEN '120' AND '160'

17
SELECT 名称,職業コード FROM パーティー
WHERE 職業コード IN(01,10,11)

18
SELECT 名称,状態コード FROM パーティー
WHERE 状態コード NOT IN('00','09')

19
SELECT * FROM パーティー
WHERE HP > 100 AND MP > 100

20
SELECT * FROM パーティー
WHERE ID LIKE 'A%' AND 職業コード LIKE '2%'

21
SELECT * FROM イベント
WHERE タイプ ='03'
AND 前提イベント番号 IS NOT NULL
AND 後続イベント番号 IS NOT NULL

22
パーティ id
イベント イベント番号

23
SELECT DISTINCT 状態コード FROM パーティー

24
SELECT ID,名称 FROM パーティー
ORDER BY ID ASC

25
SELECT 職業コード,名称 FROM パーティー
ORDER BY 名称 DESC

26
SELECT 名称,HP,状態コード FROM パーティー
ORDER BY 状態コード ASC,HP DESC

27
SELECT タイプ,イベント番号,イベント名称,
前提イベント番号,後続イベント番号 FROM イベント
ORDER BY 1 ASC,2 ASC

28
SELECT * FROM パーティー
ORDER BY HP DESC LIMIT 3

29
SELECT * FROM パーティー
ORDER BY MP DESC LIMIT 1 OFFSET 2

30
SELECT
CASE
WHEN 職業コード LIKE '1%' THEN 'S'
WHEN 職業コード LIKE '2%' THEN 'M'
ELSE 'A'
END AS 職業区分,職業コード,ID,名称
FROM パーティー
ORDER BY 職業コード

31
SELECT イベント番号 FROM イベント
WHERE イベント番号 
NOT IN(SELECT イベント番号 FROM 経験イベント)
ORDER BY イベント番号

32
SELECT イベント番号 FROM イベント
WHERE イベント番号
IN(SELECT イベント番号 FROM 経験イベント WHERE クリア区分='1')
AND タイプ = '2'

33
SELECT 名称 AS なまえ,HP AS 現在のHP,HP+50 AS 装備後のHP
FROM パーティー
WHERE 職業コード IN('11','21')
