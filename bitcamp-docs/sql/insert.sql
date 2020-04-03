 insert into users(user_no, user_name, birthday, gender, email,password, phone_number,zip_code, basic_address, detail_address,photo,nickname, account, bank)values(151,'하정우','97/01/05',2,'wldnjs2516@nver.com','rkskek123','010-1234-1234',85945,'서울 관악구 신림로 318','1901','a.gif','하대갈',17651052031153,'농협');
 insert into users(user_no, user_name, birthday, gender, email,password, phone_number,zip_code, basic_address, detail_address,photo,nickname, account, bank)values(152,'김향기','20/08/09',2,'gidrl1234@nver.com','gidrl3333','010-5678-5678',85945,'울산광역시 남구 달동 1330-1 삼산선경아파트','503','a.gif','김냄새',17651052031153,'농협');
 
insert into points(point_no, user_no, trader_no,point_type, content,price) values(180, 151, 300, 1, 3, 5000);
insert into courses(course_no,user_no,create_date) values(155,151,'2020-01-02 04:27:15');

insert into course_days(course_day_no, course_no, title, day_date)values(1, 155, '익선동 맛집 투어','20/3/20');
insert into course_days(course_day_no, course_no, title, day_date)values(2, 155, '한남동 맛집 투어','20/3/20');

insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(190,1,'블루보틀','서울 종로구 북촌로5길 76','삼청점');
insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(191,1,'경양카츠','서울 종로구 수표로28길 15');

insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(192,2,'고다이','서울 용산구 한남대로18길 28 1층');
insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(193,2,'오스테리아 오르조','서울 용산구 한남대로20길 47');

insert into info_places(place_no; start_date, last_date, place_name, place_address)values(160,'19/12/01','20/12/31','퍼스트가든 빛축제 - 별빛이 흐르는 정원','퍼스트가든 내 전역 경기도 파주시 탑삭골길 260');
insert into info_scraps(user_no, place_no)values(151,190);
insert into infos(info_no,create_date, category, content, photo_file, main_photo, place_no)values(160,'19/11/30',1,'퍼스트가든은 아름다운 조명으로 정원을 장식한 별빛축제를 365일 연중무휴 운영한다. 자수화단의 환상적인 별빛, 토스카나 광장의 이국적인 별빛, 로즈가든의 정열적인 별빛은 추위로 얼어붙은 겨울밤을 녹이고 로맨틱한 겨울밤 분위기를 자아낸다. 

[별빛이 흐르는 정원]을 슬로건으로 은하수를 담은 별자리 여행처럼 더 화려하고 볼거리가 많은 별빛축제로 새롭게 모습을 선보이며, 약 2만평 규모의 테마정원마다 다른 주제로 사계절의 대표 별자리를 비롯한 다양한 별자리가 지상에 내려앉은 모습을 볼 수 있다.','g.gif','f.gif',160);
insert into infos(info_no,create_date, category, content, photo_file, main_photo, place_no)values(161, '20/01/20',2,'[공지] 개인정보처리방침 추가 개정 안내입니다.',);
insert into info_photo(photo_no, info_no,photo_file)values(170, 160, 'g.gif');
insert into reviews(review_no, user_no, create_date, status)values(185,150,'20/04/21',1);

insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)values(1,'45.gif','1박 2일 부산여행 첫째날~!','20/03/01','부산여행 첫째날이에요~~ 오늘은 날씨가 좋아 흰여울문화마을로 가서 산책을 했습니다~!',185,1);
insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)values(2,'90.gif','1박 2일 부산여행 둘째날~!','20/03/02','부산여행 둘째날이에요~~ 오늘은 날씨가 좋아 해수욕장 근처 카페에서 휴식시간을 가졌습니다~!',185,1);



insert into place_scraps(user_no,reviews_place_no,)

