window.onbeforeunload = function () {
  return "You have unsaved changes!";
};

function validatePhone(input) {
  const phonePattern = /^\d{10}$/;
  if (!phonePattern.test(input.value)) {
    alert("Invalid phone number");
  }
}

function submitForm() {
  document.getElementById("confirmationMsg").value = "Registration successful!";
}

function enlargeImage(img) {
  img.style.width = "200px";
}

function countChars(textarea) {
  console.log("Characters typed: " + textarea.value.length);
}

function videoReady() {
  document.getElementById("videoStatus").innerText = "Video ready to play!";
}

function findLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      function(position) {
        document.getElementById("locationResult").innerText =
          "Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude;
      },
      function(error) {
        document.getElementById("locationResult").innerText = "Error: " + error.message;
      },
      {
        enableHighAccuracy: true,
        timeout: 10000
      }
    );
  } else {
    document.getElementById("locationResult").innerText = "Geolocation is not supported.";
  }
}

function storePreference(select) {
  localStorage.setItem("preferredEvent", select.value);
}

function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
}
