let adminLoginUsername = document.getElementById("adminLoginUsername");
let adminLoginPassword = document.getElementById("adminLoginPassword");
let adminLoginBtn = document.getElementById("adminLoginBtn");
let addNewMemberPage = document.getElementById("addNewMemberPage");
let removeMemberBox = document.querySelectorAll(".removeMember");

try {
  adminLoginBtn.addEventListener("click", () => {
    if (
      adminLoginUsername.value == "admin" &&
      adminLoginPassword.value == "admin"
    ) {
      localStorage.setItem("adminLogedIn", true);
    } else {
      console.log("Incorrect password or username");
      adminLoginUsername.textContent == "";
      adminLoginPassword.textContent == "";
    }
  });
} catch (e) {
  console.log(e);
}
try {
  if (JSON.parse(localStorage.getItem("adminLogedIn")) == null) {
    addNewMemberPage.remove();
  }
} catch (e) {
  console.log(e);
}
try {
  if (JSON.parse(localStorage.getItem("adminLogedIn")) == null) {
    removeMemberBox.forEach((box) => box.remove());
  }
} catch (e) {
  console.log(e);
}
