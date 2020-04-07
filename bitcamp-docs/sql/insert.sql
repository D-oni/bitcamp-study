 insert into users(user_no, user_name, birthday, gender, email,password, phone_number,zip_code, basic_address, detail_address,photo,nickname, account, bank)values(151,'하정우','97/01/05',1,'wjddn000@naver.com','rkskek123','010-1234-1234',85945,'서울 관악구 신림로 318','1901','ac.gif','하대갈',null,'농협');
 insert into users(user_no, user_name, birthday, gender, email,password, phone_number,zip_code, basic_address, detail_address,photo,nickname, account, bank)values(152,'김향기','20/08/09',2,'gidrl1234@naver.com','gidrl3333','010-5678-5678',00546,'울산광역시 남구 달동 1330-1 삼산선경아파트','503','ab.gif','김냄새',null,'농협');
 
insert into points(point_no, user_no, trader_no,point_type,content,price) values(180, 152, 151, 1, 3, 5000);

insert into courses(course_no,user_no,create_date) values(155,151,'2020-01-02 04:27:15');

insert into course_days(course_day_no, course_no, title, day_date)values(1, 155, '익선동 맛집 투어','20/3/20');
insert into course_days(course_day_no, course_no, title, day_date)values(2, 155, '한남동 맛집 투어','20/3/20');

insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(190,1,'블루보틀','서울 종로구 북촌로5길 76','삼청동에 있음');
insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(191,1,'경양카츠','서울 종로구 수표로28길 15',null);
insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(192,2,'고다이','서울 용산구 한남대로18길 28 1층',null);
insert into course_places(place_no, course_day_no, place_name, place_address, etc)values(193,2,'오스테리아 오르조','서울 용산구 한남대로20길 47',null);

insert into info_places(place_no, start_date, last_date, place_name, place_address)values(160,'2019-12-01 10:00:00','2020-12-31 22:00:00','퍼스트가든 빛축제 - 별빛이 흐르는 정원','퍼스트가든 내 전역 경기도 파주시 탑삭골길 260');
insert into info_scraps(user_no, place_no)values(151,160);
insert into infos(info_no,create_date, category, content, photo_file, main_photo, place_no)values(160,'2019-11-30 00:00:00',1,'퍼스트가든은 아름다운 조명으로 정원을 장식한 별빛축제를 365일 연중무휴 운영한다. 자수화단의 환상적인 별빛, 토스카나 광장의 이국적인 별빛, 로즈가든의 정열적인 별빛은 추위로 얼어붙은 겨울밤을 녹이고 로맨틱한 겨울밤 분위기를 자아낸다. 별빛이 흐르는 정원을 슬로건으로 은하수를 담은 별자리 여행처럼 더 화려하고 볼거리가 많은 별빛축제로 새롭게 모습을 선보이며, 약 2만평 규모의 테마정원마다 다른 주제로 사계절의 대표 별자리를 비롯한 다양한 별자리가 지상에 내려앉은 모습을 볼 수 있다.','g.gif','f.gif',160);
insert into infos(info_no,create_date, category, content, photo_file, main_photo, place_no)values(161,'2020-01-20 00:00:00',2,'[공지] 개인정보처리방침 개정 안내 - 개인정보처리방침 개정 안내를 드리오니 개정 및 수정된 내용을 반드시 확인해 주시기 바랍니다.',null,null,null);
insert into info_photo(photo_no, info_no,photo_file)values(170, 160, 'g.gif');

insert into reviews(review_no, user_no, create_date, status)values(185,151,'20/04/21',1);

insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)values(1,'45.gif','1박 2일 부산여행 첫째날~!','20/03/01','부산여행 첫째날이에요~~ 오랜시간 기차를 타고 왔더니 배가 고파 먼저 광안리로 가서 점심을 먹기로 했어요!',185,1);
insert into review_days(review_day_no, main_photo, title, day_date, day_review, review_no, status)values(2,'90.gif','1박 2일 부산여행 둘째날~!','20/03/02','아침 일찍 일어났는데 날씨가 너무 좋은...사이에 해운대보이시져...ㅠ_ㅠ 사이오션뷰 만족만족 ㅎㅎㅎ',185,1);

insert into review_place(review_place_no, place_name,place_address,place_review,main_photo,review_day_no,status)values(1,'안녕도담','부산 동래구 온천천로471번가길 45-1','버스타고 온천천쪽으로 안녕 도담 이라는 경양식집을 갔어요! 도담 건강함박(12,000) 인스타로 검색했을때 후라이드함박이 바삭하니 맛있을거 같아서 갔는데 막상 도착해서 급 메뉴바꾸기 ㅎㅎㅎ건강함박 너무너무 맛있어요 ㅠ_ㅠ 식전 스프랑 식후 디저트로 호박조각케이크까지.. 최고최고!!!!!','a.gif',1,1);
insert into review_place(review_place_no, place_name,place_address,place_review,main_photo,review_day_no,status)values(2,'스타벅스 광안리점','부산 수영구 광안해변로 247','광안리 도착해서 근처 소품샵 2군데 정도 둘러보고 바다 바로앞 스타벅스! 서울에서도 스타벅스 참 많이 가는데.. 부산의 스타벅스는 광안리뷰....점점 어둠이 찾아오는 광안리 노을이 너무너무 예쁘고 멋있었어요 ㅠ____ㅠ ♡','b.gif',1,1);
insert into review_place(review_place_no, place_name,place_address,place_review,main_photo,review_day_no,status)values(3,'베스트루이스해밀턴 호텔 광안점','부산광역시 수영구 광안해변로 276','광안리 회센터에서 회사고 마트서 장봐서 숙소로! 해운대역 앞에 베스트루이스해밀턴 호텔! 만족도 매우매우 높았어요!! 숙소 컨디션도 좋고 조용하고!(해운대점,광안리점 모두있으니 참고하세요)','c.gif',1,1);
insert into review_place(review_place_no, place_name,place_address,place_review,main_photo,review_day_no,status)values(4,'자매국밥','부산 수영구 민락본동로27번길 56','원래는 저의 인생국밥인 서면에 송정3대국밥 가려다 멀어서 광안리 근처 자매국밥! 결론부터 말하자면 완전 실망했어요..줄까지 섰는데.. 제일 실망한 부분은 순대가 거의 슬라이스수준에 건더기가 너무 없는....','d.gif',2,1);
insert into review_place(review_place_no, place_name,place_address,place_review,main_photo,review_day_no,status)values(5,'로즈랜드','부산 수영구 광안해변로 153-1 3층','오션뷰 카페 검색검색해서 찾아온 로즈랜드! 광안리해변 메인에서 좀 많이 걸었어요!쇼케이스에 베이커리 보고 그닥 기대안했는데 정말 예쁘게 데코해서 나오더라구요 ㅎㅎㅎ 그리고 넘 맛있었어요! 브라우니에는 아이스크림 한스쿱 추가 강추합니다!!!','e.gif',2,1);

insert into review_place_photo(photo_no,review_place_no,photo_file)value(155,1,'a.gif');
insert into review_place_photo(photo_no,review_place_no,photo_file)value(156,2,'b.gif');
insert into review_place_photo(photo_no,review_place_no,photo_file)value(157,3,'c.gif');
insert into review_place_photo(photo_no,review_place_no,photo_file)value(158,4,'d.gif');
insert into review_place_photo(photo_no,review_place_no,photo_file)value(159,5,'e.gif');

insert into place_scraps(user_no,review_place_no)values(151,1);
insert into place_scraps(user_no,review_place_no)values(151,3);
insert into place_scraps(user_no,review_place_no)values(152,5);


insert into day_scraps(user_no,review_day_no)values(151,1);

