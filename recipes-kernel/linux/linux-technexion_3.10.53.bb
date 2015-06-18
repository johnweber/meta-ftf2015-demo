# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for TechNexion"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

# Put a local version until we have a true SRCREV to point to
SCMVERSION ?= "y"

SRCBRANCH ??= "master"
LOCALVERSION ?= "-${SRCBRANCH}"

DEPENDS += "lzop-native bc-native"

# Allow override of TECHNEXION_GITHUB_MIRROR to make use of
# local repository easier
TECHNEXION_GITHUB_MIRROR ?= "git://github.com/technexion/linux.git"

# SRC_URI for TechNexion kernel
SRC_URI = "${TECHNEXION_GITHUB_MIRROR};branch=${SRCBRANCH} \
           file://defconfig \
"
# TechNexion branch - based on 3.10.53_1.1.0_ga from Freescale git

SRCBRANCH = "tn-mx6-3.10.53_ga-update1"
SRCREV = "c758e77ebb62db6419285b7d284a84e5a426934b"
LOCALVERSION = "_1.1.0_ga-technexion"

COMPATIBLE_MACHINE = "(picosom)"
