#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "multiple_flutters_module"
DESCRIPTION = "A module that is embedded in the multiple_flutters_ios and multiple_flutters_android sample code."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "291ba126bfc1279d074b91e61ad44919768ebe7f"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "multiple_flutters_module"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-add-to-app-multiple-flutters-multiple-flutters-module"
FLUTTER_APPLICATION_PATH = "add_to_app/multiple_flutters/multiple_flutters_module"

inherit flutter-app
