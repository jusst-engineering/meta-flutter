#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "audioplayers_example"
DESCRIPTION = "Demonstrates how to use the audioplayers plugin."
AUTHOR = "Luan Nico"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bacf6c2e93531d3d438d05353cede782"

SRCREV = "f45aff22ab6e67a82ac8ea030afaf7a94993471e"
SRC_URI = "git://github.com/bluefireteam/audioplayers.git;lfs=0;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "audioplayers_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "bluefireteam-audioplayers-packages-audioplayers-example"
FLUTTER_APPLICATION_PATH = "packages/audioplayers/example"

inherit flutter-app

RDEPENDS:${PN} += " \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
"
