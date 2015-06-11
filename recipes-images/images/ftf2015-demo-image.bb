include recipes-core/images/core-image-base.bb

SOC_EXTRA_IMAGE_FEATURES ?= ""

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
    tools-debug \
"

IMAGE_INSTALL += " \
    packagegroup-ftf2015-demo-test \
"

export IMAGE_BASENAME = "ftf2015-demo-image"
