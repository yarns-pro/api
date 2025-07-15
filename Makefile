pwd := $(shell pwd)
local_bin := ${pwd}/bin
buf_bin := ${local_bin}/buf

.PHONY: proto-deps
proto-deps:
	# install binaries
	GOBIN="$(local_bin)" go install github.com/bufbuild/buf/cmd/buf

.PHONY: proto
proto:
	PATH=${local_bin}:$(PATH) ${buf_bin} --debug generate -v
