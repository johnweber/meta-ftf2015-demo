# Copyright (C) 2015 Avnet Electronics Marketing

DESCRIPTION = "Lepton Utilities"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git:///opt/git/lepton-utils.git;branch=master"
SRCREV = "5b1348790b1068ace6ffb1fdab1028bc71b470e4"

inherit autotools-brokensep

S = "${WORKDIR}/git"

RDEPENDS_${PN} = " \
	kernel-module-v4l2loopback \
	libpng \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
