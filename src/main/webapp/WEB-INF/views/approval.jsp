<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Management Portal</title>
        <link rel="stylesheet" type="text/css" href="/css/main.css" />
  <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        .form-container {
            margin-bottom: 20px;
        }
        .form-container input {
            margin-right: 10px;
        }
        .form-container button {
            margin-right: 10px;
        }
    </style>   
</head>
<body>
     <div class="container">
        <header>
            <div class="user-info">
                <img src="profile.jpg" alt="User Profile">
                <div>
                    <p>이름: 김자바</p>
                    <p>직책: ${user.position }</p>
                    <p>사번: ${user.empno }</p>
                    <p>김자바 님 환영합니다.</p>
                </div>
            </div>
            <h1>코멧 업무포털</h1>
            <div class="header-right">
                <button id="start">업무시작</button>
                <button id="end">업무종료</button>
                <p id="startTime"><c:if test="${startTime !=null}"><fmt:formatDate value="${startTime}" pattern="HH:mm" />/</c:if><c:if test="${startTime==null}">00:00/</c:if></p>
                <p id="endTime">00:00</p>
                <nav>
                    <a href="#">Home</a>
                    <a href="/cleander">연봉계산기</a>
                    <a href="#">개인정보수정</a>
                    <a href="/logout">로그아웃</a>
                </nav>
            </div>
        </header>
        <main>
            <aside>
                <ul class="menu">
                    <li><a href="#">통합업무</a></li>
                    <li><a href="#">게시판</a></li>
                    <li><a href="/approval">전자결재</a></li>
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
                    <div class="form-container">
        <label for="approval_no">결제번호:</label>
        <input type="text" id="approval_no" name="approval_no">
        <label for="approval_title">결재 제목:</label>
        <input type="text" id="approval_title" name="approval_title">
        <label for="startDate">작성일:</label>
        <input type="date" id="startDate" name="startDate">
        <input type="date" id="startDate" name="startDate">
        <button onclick="search()">조회</button>
        <select>
        	<option>
        		요청
        	</option>
        	<option>
        		승인
        	</option>
        	<option>
        		대기
        	</option>
        	<option>
        		반려
        	</option>
        </select>
            <button>등록</button>
        
    </div>
    <table>
        <thead>
            <tr>
                <th>구분코드</th>
                <th>계약코드</th>
                <th>구분명칭</th>
                <th>적용일</th>
                <th>비고</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>001</td>
                <td>CON123</td>
                <td>계약명칭</td>
                <td>2024-08-01</td>
                <td>비고 내용</td>
            </tr>
        </tbody>
    </table>
                </div>
            </section>
        </main>
    </div>
</body>
</html>