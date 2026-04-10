# Riprocare

Riprocare is an Android healthcare application designed to simplify access to lab tests, medicines, and doctor appointments. The app provides a seamless experience for users to book appointments, order medicines, and schedule lab tests from their mobile devices.

## Features

- **Find Doctors:** Search and view details of doctors by specialty (Family Physician, Dietician, Dentist, Surgeon, etc.).
- **Book Appointments:** Schedule appointments with doctors directly from the app.
- **Lab Tests:** Browse and book various lab test packages, view details, and manage lab test cart items.
- **Buy Medicines:** Order a wide range of medicines, view details, and manage your medicine cart.
- **Order Management:** View and manage your orders for medicines and lab tests.
- **User Authentication:** Register and login securely to access personalized features.
- **Health Articles:** Read articles related to health and wellness.

## Main Modules & Activities

- `MainActivity`: Entry point of the app.
- `HomeMainActivity`: Dashboard with navigation to all main features.
- `FindDoctorMainActivity`: Browse and select doctors by specialty.
- `DoctorDetailsActivity`: View detailed information about doctors.
- `BookAppointmentActivity`: Book appointments with doctors.
- `LabTestActivity`: Browse and book lab test packages.
- `LabTestDetailsActivity`, `LabTestBookActivity`, `CartLabActivity`: Manage lab test details and cart.
- `BuyMedicineActivity`: Browse and order medicines.
- `BuyMedicineDetailsActivity`, `BuyMedicineBookActivity`, `CartBuyMedicineActivity`: Manage medicine details and cart.
- `OrderDetailsActivity`: View order history and details.
- `RegisterActivity` / `LoginActivity`: User registration and authentication.
- `HealthArticlesActivity`, `HealthArticlesDetailsActivity`: Read health-related articles.

## Tech Stack

- **Language:** Java
- **Framework:** Android SDK
- **Minimum SDK:** 24
- **Target SDK:** 35
- **Libraries:**
	- AndroidX AppCompat
	- Material Components
	- ConstraintLayout
	- JUnit (testing)

## Getting Started

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Project Structure

- `app/src/main/java/com/example/riprocare/` — All Java source files (activities, logic)
- `app/src/main/res/` — Resources (layouts, drawables, values)
- `app/src/main/AndroidManifest.xml` — App manifest and activity declarations
- `build.gradle.kts` — Project and app-level build configuration

## License
See [LICENSE](LICENSE) for license details.

---

**Developed by Rifat**
