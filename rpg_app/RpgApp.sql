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

34
UPDATE パーティー SET MP =MP+20
WHERE ID IN('A01','A03')

35
SELECT 名称 AS 名前,HP AS 現在のHP,HP*2 AS 予想されるダメージ
FROM パーティー
WHERE 職業コード = '11'

36
SELECT
名称 AS なまえ,concat(hp,'/',mp) AS HPとMP,
CASE
WHEN 状態コード = '00' OR 状態コード IS NULL THEN ''
ELSE 状態コード
END AS ステータス
FROM パーティー AS p
LEFT JOIN(SELECT * FROM コード WHERE コード種別 = 2)AS c
ON p.状態コード =c.コード値

37
SELECT イベント番号,イベント名称,タイプ,
CASE
WHEN タイプ='1' THEN '強制'
WHEN タイプ='3' THEN '特殊'
ELSE 'フリー'
END AS タイプ,
CASE
WHEN イベント番号 BETWEEN '1' AND '10' THEN '序盤'
WHEN イベント番号 BETWEEN '11' AND '17' THEN '中盤'
ELSE '終盤'
END AS 発生時期
FROM イベント

38
SELECT 名称 AS なまえ,HP AS 現在のHP,
char_length(名称)*10 AS 予想ダメージ
FROM パーティー

39
UPDATE パーティー SET 状態コード= '04'
WHERE HP % 4 = 0 OR MP % 4 = 0

40
SELECT FLOOR(777*0.7) AS 支払った金額

41
UPDATE パーティ SET hp=ROUND(HP*1.3,0),
mp=ROUND(MP*1.3,0)

42
SELECT 名称 AS なまえ,HP,
POWE(HP,0) AS 攻撃1回目,
POWE(HP,1) AS 攻撃2回目,
POWE(HP,2) AS 攻撃3回目
FROM パーティー
WHERE 職業コード = '10'

43
SELECT 名称 AS なまえ,
hp AS HP,
状態コード,
CASE
WHEN hp<=50 THEN 3+CAST(状態コード AS SIGNED)
WHEN hp<=100 THEN 2+CAST(状態コード AS SIGNED)
WHEN hp<=150 THEN 1+CAST(状態コード AS SIGNED)
ELSE CAST(状態コード AS SIGNED)
END AS リスク値
FROM パーティー
ORDER BY リスク値 DESC,HP ASC;

44
SELECT イベント番号
CASE
WHEN 前提イベント番号 IS NULL THEN '前提なし'
ELSE 前提イベント番号
END AS 前提イベント番号,
CASE
WHEN 後続イベント番号 IS NULL THEN '前提なし'
ELSE 後続イベント番号
END AS 後続イベント番号
FROM イベント
ORDER BY イベント番号 ASC

45
SELECT max(hp) AS HP最大値, 
max(mp) AS MP最大値, 
min(hp) AS HP最小値, 
min(mp) AS MP最小値,
avg(hp) AS HP平均値, 
avg(mp) AS MP平均値 
FROM パーティー

46
SELECT 
CASE タイプ
WHEN '1' THEN '強制'
WHEN '2' THEN 'フリー'
ELSE '特殊'
END AS タイプ,
COUNT(イベント番号)
FROM イベント
GROUP BY タイプ

47
SELECT
クリア結果,
COUNT(イベント番号) AS イベント数
FROM 経験イベント
GROUP BY クリア結果
ORDER BY クリア結果

48
SELECT
CASE
WHEN SUM(MP) <500 THEN '敵は見とれている!'
WHEN SUM(MP) >=500 THEN '敵は呆然としている!'
WHEN SUM(MP) >=1000 THEN '敵はひれ伏している!'
END AS 敵の行動
FROM パーティー

49
SELECT
CASE クリア区分
WHEN '1' THEN 'クリアした'
WHEN '0' THEN '参加したがクリアしてない'
END AS 区分,
COUNT(イベント番号) AS イベント数
FROM 経験イベント
GROUP BY クリア区分
ORDER BY イベント数 DESC

50


