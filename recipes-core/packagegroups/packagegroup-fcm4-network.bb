SUMMARY = "Networking stack for phone-like OS"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
  iproute2 \
  ethtool \
  networkmanager \
  wpa-supplicant \
  iw \
  curl \
  wget \
"
