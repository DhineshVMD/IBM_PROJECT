const dashboardData = {
  users: 1245,
  revenue: 12480,
  orders: 320,
  tasks: 18
};

const usersData = [
  { id: 1, name: "John Doe", role: "Admin" },
  { id: 2, name: "Jane Smith", role: "Staff" },
  { id: 3, name: "Alex Lee", role: "Customer" }
];

const reportsData = {
  daily: "Good performance",
  weekly: "+12% Growth",
  monthly: "Stable"
};

const settingsData = {
  profile: "Edit admin info",
  security: "Update password",
  notifications: "Manage alerts"
};

// ====== Page Loading Functions ======

function loadDashboard() {
  console.log("📊 Loading Dashboard...");
  const container = document.getElementById("contentArea");
  container.innerHTML = `
    <div class='card'><h3>Total Users</h3><p>${dashboardData.users}</p></div>
    <div class='card'><h3>Revenue</h3><p>$${dashboardData.revenue}</p></div>
    <div class='card'><h3>Active Orders</h3><p>${dashboardData.orders}</p></div>
    <div class='card'><h3>Pending Tasks</h3><p>${dashboardData.tasks}</p></div>
  `;
}

function loadUsers() {
  console.log("👥 Loading Users...");
  const container = document.getElementById("contentArea");
  container.innerHTML = usersData
    .map(
      (u) =>
        `<div class='card'><h3>${u.name}</h3><p>Role: ${u.role}</p></div>`
    )
    .join("");
}

function loadReports() {
  console.log("📈 Loading Reports...");
  const container = document.getElementById("contentArea");
  container.innerHTML = `
    <div class='card'><h3>Daily Report</h3><p>${reportsData.daily}</p></div>
    <div class='card'><h3>Weekly Report</h3><p>${reportsData.weekly}</p></div>
    <div class='card'><h3>Monthly Report</h3><p>${reportsData.monthly}</p></div>
  `;
}

function loadSettings() {
  console.log("⚙️ Loading Settings...");
  const container = document.getElementById("contentArea");
  container.innerHTML = `
    <div class='card'><h3>Profile</h3><p>${settingsData.profile}</p></div>
    <div class='card'><h3>Security</h3><p>${settingsData.security}</p></div>
    <div class='card'><h3>Notifications</h3><p>${settingsData.notifications}</p></div>
  `;
}

// ====== Simulated Page Switcher ======
function navigate(page) {
  document.getElementById("pageTitle").innerText = page;
  switch (page.toLowerCase()) {
    case "dashboard":
      loadDashboard();
      break;
    case "users":
      loadUsers();
      break;
    case "reports":
      loadReports();
      break;
    case "settings":
      loadSettings();
      break;
    default:
      document.getElementById("contentArea").innerHTML =
        "<p>Page not found.</p>";
  }
}

// ====== Example Initialization ======
document.addEventListener("DOMContentLoaded", () => {
  console.log("✅ Admin Dashboard JS initialized");
  navigate("Dashboard");
});
