#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "firebase_app_check_example"
DESCRIPTION = "Firebase App Check example application."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93a5f7c47732566fb2849f7dcddabeaf"

SRCREV = "8ef7421d6a524938087769537ac70ec249096ed4"
SRC_URI = "git://github.com/firebase/flutterfire.git;lfs=0;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "firebase_app_check_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "firebase-flutterfire-packages-firebase-app-check-firebase-app-check-example"
FLUTTER_APPLICATION_PATH = "packages/firebase_app_check/firebase_app_check/example"

inherit flutter-app
