#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "interactive_media_ads_example"
DESCRIPTION = "Demonstrates how to use the interactive_media_ads plugin."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "754de1918a339270b70971b6841cf1e04dd71050"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "interactive_media_ads_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-interactive-media-ads-interactive-media-ads-example"
FLUTTER_APPLICATION_PATH = "packages/interactive_media_ads/example"

inherit flutter-app
