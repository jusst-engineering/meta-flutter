#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "flutter_module_books"
DESCRIPTION = "A Flutter module using the Pigeon package to demonstrate integrating Flutter in a realistic scenario where the existing platform app already has business logic and middleware constraints."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "291ba126bfc1279d074b91e61ad44919768ebe7f"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_module_books"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-add-to-app-books-flutter-module-books"
FLUTTER_APPLICATION_PATH = "add_to_app/books/flutter_module_books"

inherit flutter-app
