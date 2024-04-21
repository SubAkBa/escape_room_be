drop table room;

create table if not exists room (
      room_no int auto_increment,
      room_name varchar(50) not null,
      description varchar(1000),
      poster varchar(100),
      `level` int,
      fear int,
      min_personnel int,
      max_personnel int,
      time_limit int,
      reg_time timestamp,
      register varchar(10),
      mod_time timestamp,
      modifier varchar(10),
      primary key (room_no)
);

insert into room values (
    null,
    "다크나이트",
    "범죄와 부정부패를 제거하여 고담시를 지키려는 당신. 당신은 짐 고든 형사와 패기 넘치는 고담시 지방 검사 하비 덴트와 함께 도시를 범죄 조직으로부터 영원히 구원하고자 한다. 보라색 양복을 입고 얼굴에 짙게 화장을 한 괴이한 존재, 어떠한 룰도 목적도 없는 사상 최악의 악당 미치광이 살인광대 ‘조커’로부터 위협받는 고담시를 지킬 수 있을 것인가.",
    "img",
    2,
    1,
    2,
    6,
    60,
    NOW(),
    "손원주",
    NOW(),
    "손원주"
),
(
    null,
    "컨저링",
    "당신은 유명한 귀신연구자이며 동시에 초자연적인것의 전문가. 어느 날, 페론가족에게서 방문 요청을 받게 되어 집으로 찾아갔는데, 당신은 불길한 기운을 감지하게 되고 본격적인 조사에 들어가기 시작했다. 조사에 들어가면서 시작된 원혼들의 움직임. 당신은 원혼으로부터 페론 가족을 지킬 수 있을 것인가.",
    "img",
    3,
    3,
    2,
    4,
    60,
    NOW(),
    "손원주",
    NOW(),
    "손원주"
);