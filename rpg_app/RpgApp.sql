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
IN()
