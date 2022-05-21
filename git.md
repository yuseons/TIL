# Git&Github

## 🔸Git

### Git 이란?

- 분산형 버전 관리 시스템입니다.



### Git의 장점

1. 같은 파일을 여러 명이 동시에 작업할 수 있어 병렬 개발이 가능합니다.
2. 분산 버전 관리 시스템이기 때문에 인터넷이 연결없이도 개발을 진행할 수 있으며, 중앙 저장소가 날아가도 원상복구할 수 있습니다.
3. Git을 통해 버전 관리를 하면 체계적인 개발이 가능해집니다.



### Git 초기 설정

- 누가 커밋 기록을 남겼는지 확인할 수 있도록 이름과 이메일을 최초 한 번만 설정합니다. 
  - `git config --global user.name '이름'` : 이름 설정
  - `git config --global user.email '메일 주소'` : 메일 설정

### 로컬 저장소

- `Working Directory (= Working Tree)` : 사용자의 일반적인 작업이 일어나는 곳
- `Staging Area (= Index)` : 커밋을 하기 위한 파일 및 폴더가 모여있는 곳
- `Repository` : 커밋들이 저장되어 모여있는 곳
- Git은 **Working Directory → Staging Area → Repository** 의 과정으로 버전 관리를 수행합니다.
- ![파일의 라이프사이클.](https://git-scm.com/book/en/v2/images/lifecycle.png)

### Git 기본 명령어

1. `git init` 
  - 현재 작업 중인 디렉토리를 Git으로 관리한다는 명령어
  - `.git`이라는 숨김 폴더를 생성하고, 터미널에는 `(master)`라고 표기됩니다.
     - 터미널에 이미 (master)가 있다면, git init을 절대 입력하면 안됩니다

     - 절대로 홈 디렉토리에서 git init을 하지 않으며 터미널의 경로가 ~ 인지 확인해야합니다.

2. `git status` : 파일의 현재 상태를 알려주는 명령어

 - 파일 상태

   - `Untracked` : Git으로 관리하지 않는 파일

   - `tracked` : Git이 관리하는 파일

     a. `Unmodified` : 파일의 최신 상태

     b. `Modified` : 수정되었지만 아직 Staging Area에는 반영하지 않은 상태

     c. `Staged` : Staging Area에 반영된 상태

3. `git add`

 - 파일을 Staging Area로 올리는 명령어
 - `Untracked, Modified `→ `Staged` 로 상태를 변경
     - `git add` a. txt : 특정 파일
     - `git add` my_folder/ : 특정 폴더
     - `git add .` : 현재 티렉토리에 속한 파일/폴더 전부

4. `git commit`

- 파일 및 폴더의 추가/변경 사항을 기록하는 것입니다.

- Staging Area에 올라온 파일의 변경 사항을 하나의 버전으로 저장소에 기록하는 명령어입니다.
- 커밋 메세지는 현재 변경 사항들을 잘 나타낼 수 있도록 작성하는 것이 좋습니다.
- 각각의 커밋은 고유의 해시 값을 가지며 그 해시 값을 통해 각 커밋을 구분합니다.

5. `git log`

- 커밋의 내역을 조회하는 명령어
- `git log --oneline` : 간단히 한 줄로 축약해서 보여줍니다.
- `git log --graph` : 브랜치의 흐름을 그래프로 보여줍니다.
- `git log --all` : 현재 브랜치를 포함한 모든 브랜치의 내역을 보여줍니다.
- `git log --oneline --reverse` : 오래된 커밋 내역부터 보여줍니다. (최신이 가장 아래)
- `git log -p` : 파일의 수정된 내용도 같이 보여줍니다.
