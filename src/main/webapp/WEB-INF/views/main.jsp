<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Management Portal</title>
        <link rel="stylesheet" type="text/css" href="/css/main.css" />
    
</head>
<body>
     <div class="container">
        <header>
            <div class="user-info">
                <img src="profile.jpg" alt="User Profile">
                <div>
                    <p>이름: 김자바</p>
                    <p>직책: 대리</p>
                    <p>사번: 100100</p>
                    <p>김자바 님 환영합니다.</p>
                </div>
            </div>
            <h1>코멧 업무포털</h1>
            <div class="header-right">
                <button>업무시작</button>
                <button>업무종료</button>
                <p>09:05</p>
                <p>18:05</p>
                <nav>
                    <a href="#">Home</a>
                    <a href="#">연봉계산기</a>
                    <a href="#">개인정보수정</a>
                    <a href="#">로그아웃</a>
                </nav>
            </div>
        </header>
        <main>
            <aside>
                <ul class="menu">
                    <li><a href="#">통합업무</a></li>
                    <li><a href="#">게시판</a></li>
                    <li><a href="#">전자결재</a></li>
                    <li><a href="#">결재승인</a></li>
                    <li><a href="#">캘린더</a></li>
                    <li><a href="#">직원관리</a></li>
                    <li><a href="#">관찰관리</a></li>
                </ul>
                <p class="footer-text">현재시간 : 24/07/31 수요일 09:15</p>
                <p class="footer-text">코멧업무포털</p>
            </aside>
            <section class="main-content">
                <div class="status-overview">
                    <h2>나의 출근 현황</h2>
                    <table>
                        <tr>
                            <th>구분</th>
                            <th>기준</th>
                            <th>사용</th>
                            <th>잔여</th>
                        </tr>
                        <tr>
                            <td>연차x12</td>
                            <td>11일</td>
                            <td>2일</td>
                            <td>5일</td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <th>구분</th>
                            <th>출근</th>
                            <th>지각</th>
                            <th>결근</th>
                        </tr>
                        <tr>
                            <td>출근x31</td>
                            <td>11일</td>
                            <td>2일</td>
                            <td>0일</td>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <div class="note">
                        <p>12:20 부장님과 점심</p>
                        <p>14:50 미팅</p>
                    </div>
                    <div class="note">
                        <p>Add notes</p>
                    </div>
                </div>
                <div class="calendar">
                    <h2>September, 2024</h2>
                    <div class="calendar-grid">
                        <div>Mon</div>
                        <div>Tue</div>
                        <div>Wed</div>
                        <div>Thu</div>
                        <div>Fri</div>
                        <div>Sat</div>
                        <div>Sun</div>
                        <!-- Add the rest of the days here -->
                    </div>
                </div>
                <div class="chart">
                    <h2>출근 현황</h2>
                    <!-- Chart will be added here -->
                </div>
            </section>
        </main>
    </div>
</body>
</html>