# Copyright (C) 2012 Freescale Semiconductor
# Copyright (C) 2014 John Weber
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "FTF2015 Demo Package Group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES += " \
    ${PN}-base \
    ${PN}-test \
"

RDEPENDS_${PN}-base = " \ 
    glive \
    kernel-module-v4l2loopback \
"

RDEPENDS_${PN}-test = " \
    ${PN}-base \
    dropbear \
    elfutils \
    openssh-sftp-server \
    iperf \
    lmbench \
"

